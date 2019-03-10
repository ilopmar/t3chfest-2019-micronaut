FROM oracle/graalvm-ce:1.0.0-rc13 as graalvm
COPY . /home/app/encrypt-service
WORKDIR /home/app/encrypt-service
RUN ./build-native-image.sh

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/encrypt-service .
ENTRYPOINT ["./encrypt-service"]
