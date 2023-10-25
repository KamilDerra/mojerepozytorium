FROM python:3.11

RUN ["mkdir", "app"]
WORKDIR "app"

COPY "requirements.txt" .
RUN ["pip", "install", "-r", "requirements.txt"]

COPY "mainapp.py" .

RUN ["chmod", "+x", "./mainapp.py"]
EXPOSE 80
ENTRYPOINT ["./mainapp.py"]
