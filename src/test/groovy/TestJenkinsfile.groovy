import com.lesfurets.jenkins.unit.BasePipelineTest
import com.lesfurets.jenkins.unit.BaseRegressionTest
import org.junit.Before
import org.junit.Test

class TestJenkinsfile extends BasePipelineTest {

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        binding.setVariable('scm', [
                $class                              : 'GitSCM',
                branches                            : [[name: 'testtest']],
                doGenerateSubmoduleConfigurations   : false,
                extensions                          : [],
                submoduleCfg                        : [],
                userRemoteConfigs                   : [[ url: "/var/git-repo" ]]
        ])
    }

    @Test
    public void should_execute_jenkinsfile_correclty() throws Exception {
        runScript('Jenkinsfile')
        printCallStack()
        //testNonRegression()
    }
}
