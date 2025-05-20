def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([string(credentialsId: 'docker-nitishkashyap08', variable: 'dockerhubpass')]) {
        sh 'echo "$dockerhubpass" | docker login -u nitishkashyap08 --password-stdin'
    }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
