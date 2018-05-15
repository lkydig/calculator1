pipeline {
    agent any
    stages {
        stage ('checkout') {
            steps {
                git url: 'https://github.com/lkydig/calculator1.git'
            }
        }
	stage ('Package') {
	    steps {
		sh "./gradlew build"
	    }
	}
	stage ('Docker build') {
	    steps {
		sh "docker build -t localhost:5000/msh/calculator ."
	    }
	}
    }
}
