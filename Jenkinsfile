pipeline {
    agent any

    stages {
        stage('git pull') {
            steps {
                git branch: 'main', url: 'https://github.com/bolleyboll/SPE-Mini-Project.git'
            }
        }
        stage('mvn build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker Image Generation & Upload to DockerHUb') {
            steps {
                script{
                    img = docker.build "freshlyjuiced/spe-mini-proj:latest"
                    docker.withRegistry('', 'cred-docker'){
                        img.push()
                    }
                }
            }
        }
        stage('Ansible pull Docker Image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, credentialsId: 'cred-ssh', installation: 'Ansible', inventory: 'ansible/inventory.txt', playbook: 'ansible/playbook.yml', sudoUser: null
            }
        }
    }
}
