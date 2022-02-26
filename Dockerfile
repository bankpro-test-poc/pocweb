
#使用基礎版本的docker
FROM ubuntu/poc:base as ubuntu-poc-base

#維護人員
MAINTAINER bankpro

#docker啟動時使用的初始路徑
WORKDIR /mnt

#bat檔傳進來的參數
ARG TARGET_FILENAME

# linux 寫法
COPY ./target/$TARGET_FILENAME /mnt

# windows寫法
# COPY /target/$TARGET_FILENAME /mnt


# 如果是使用tar檔安裝jdk，java home 要當作參數傳進去docker，在docker裡面設定/etc/environment，沒有用
# ENV JAVA_HOME /usr/lib/java/jdk-11.0.14.1+1
# ENV PATH "$JAVA_HOME/bin:$PATH"

CMD java -jar /mnt/$TARGET_FILENAME
