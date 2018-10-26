node() {
    stage('checkout') {
        checkout(scm)
    }
    stage('build and test') {
        junit 'build/test-results/test/*.xml'
    }
}
