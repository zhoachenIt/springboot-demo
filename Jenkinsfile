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

  }
}