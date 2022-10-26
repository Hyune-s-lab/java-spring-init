./gradlew bootjar
docker build -f docker/Dockerfile -t java-spring-init .

nohup docker-compose up 1>/dev/null 2>&1 &
