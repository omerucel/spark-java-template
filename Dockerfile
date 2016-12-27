FROM openjdk:8-alpine
WORKDIR /code
ADD build/libs/project-all-1.0.jar /code/project.jar
CMD ["java", "-cp", "/code/project.jar", "com.omerucel.project.Server"]