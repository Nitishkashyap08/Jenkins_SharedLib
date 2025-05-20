def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialsId: 'docker-nitishkashyap08', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh "echo \"$DOCKER_PASS\" | docker login -u $DOCKER_USER --password-stdin"
    }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}

