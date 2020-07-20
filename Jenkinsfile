pipeline {
  agent any
  stages {
    stage('git pull') {
      steps {
        git(url: 'https://github.com/zhoachenIt/springboot-demo.git', changelog: true, branch: 'master')
      }
    }

    stage('build') {
      steps {
        bat 'mvn clean compile package -Dmaven.repo.local=E:\\JavaTools\\MavenRepository\\Repository'
      }
    }

    stage('pscp') {
      steps {
        bat 'pscp -l root -pw root -r target/demo-0.0.1-SNAPSHOT.jar root@192.168.28.110:/home < D:/confirm.bat'
      }
    }

  }
}