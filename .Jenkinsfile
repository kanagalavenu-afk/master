pipeline {
    agent any

    stages {
        dir('E:\\github')
        stage('Clone Repository') {
            steps {
                git branch: 'main', credentialsId: 'user_password', url: 'https://github.com/kanagalavenu-afk/master.git'
            }
        }
    }
}
