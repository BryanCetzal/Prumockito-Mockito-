pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git credentialsId: '9796e196-abe5-4f6e-bae0-5d319d297594', url: 'https://github.com/BryanCetzal/Prumockito-Mockito-.git'
            }
        }
        stage('Build') {
            steps {
                sh 'docker build -t prumockito .'
            }
        }
        stage('Test') {
            steps {
                sh 'docker run prumockito tests'
            }
        }
    }
}
