package eu.brugger.martin.acceptance.framework;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class CustomTestExecutionListener implements TestExecutionListener {

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
    }

    @Override
    public void prepareTestInstance(TestContext testContext) throws Exception {
        System.out.println("prepare test instance");

    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println("before test method");

    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        testContext.markApplicationContextDirty(DirtiesContext.HierarchyMode.EXHAUSTIVE);

    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {

    }
}
