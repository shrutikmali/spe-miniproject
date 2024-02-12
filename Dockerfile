FROM ubuntu:22.04

RUN apt-get update \
    && apt-get -y --no-install-recommends install ca-certificates gnupg \
    && export GNUPGHOME="$(mktemp -d)" \
    && gpg --no-default-keyring --keyring gnupg-ring:/etc/apt/trusted.gpg.d/sapmachine.gpg --batch --keyserver hkps://keys.openpgp.org --recv-keys CACB9FE09150307D1D22D82962754C3B3ABCFE23 \
    && chmod 644 /etc/apt/trusted.gpg.d/sapmachine.gpg \
    && echo "deb http://dist.sapmachine.io/debian/$(dpkg --print-architecture)/ ./" > /etc/apt/sources.list.d/sapmachine.list \
    && apt-get update \
    && apt-get -y --no-install-recommends install sapmachine-21-jre-headless=21.0.2 \
    && apt-get remove -y --purge --autoremove ca-certificates gnupg \
    && rm -rf "$GNUPGHOME" /var/lib/apt/lists/*

ENV JAVA_HOME=/usr/lib/jvm/sapmachine-21

COPY target/spe-calculator-1.0-SNAPSHOT.jar /
CMD ["java", "-jar", "spe-calculator-1.0-SNAPSHOT.jar"]