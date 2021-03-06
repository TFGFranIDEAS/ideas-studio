package es.us.isa.ideas.test.app;

import es.us.isa.ideas.test.app.pageobject.PageObject;
import es.us.isa.ideas.test.app.pageobject.testcase.DynatreeTestCase;
import es.us.isa.ideas.test.app.pageobject.testcase.WorkspaceDashboardTestCase;
import es.us.isa.ideas.test.app.pageobject.testcase.WorkspaceDemoTestCase;
import es.us.isa.ideas.test.app.pageobject.testcase.WorkspaceEditorTestCase;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Applied Software Engineering Research Group (ISA Group) University of
 * Sevilla, Spain
 * 
 * This test suite should be run only by developers.
 *
 * @author Felipe Vieira da Cunha Serafim <fvieiradacunha@us.es>
 * @version 1.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    DynatreeTestCase.class,
    WorkspaceEditorTestCase.class,
    WorkspaceDashboardTestCase.class,
    WorkspaceDemoTestCase.class
})
public class TestSuiteCore {

    private static final Logger LOG = Logger.getLogger(TestSuiteCore.class
            .getName());

    @BeforeClass
    public static void setUp() {
        LOG.log(Level.INFO, "#### Starting TestSuiteCore...");
    }

    @AfterClass
    public static void tearDown() {
        LOG.log(Level.INFO, "#### TestSuiteCore finished");
		PageObject.getWebDriver().close();
    }

}
