node() {
    stage('checkout') {
        checkout(scm)
    }
    stage('build and test') {
        sh './gradlew build'
        junit 'build/test-results/test/*.xml'
    }
}
