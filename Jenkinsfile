pipeline {
    agent {
        docker { image 'andre-image:latest' }
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