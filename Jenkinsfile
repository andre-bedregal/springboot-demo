pipeline {
    agent {
        docker {
            image 'andre-image:latest'
            args '-v $HOME/.m2:/var/maven/.m2:z -e MAVEN_CONFIG=/var/maven/.m2 -e MAVEN_OPTS="-Duser.home=/var/maven"'
        }
    }
    stages {
        stage('Hello') {
            steps {
                sh 'java --version'
                sh 'mvn --version'
                sh 'mvn clean package'
            }
        }
    }
}