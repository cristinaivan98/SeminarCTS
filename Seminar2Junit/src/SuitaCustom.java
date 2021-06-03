import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTestMock.class,GrupaTest.class,TesteGrupeFixture.class})
//@Categories.IncludeCategory(getPromovabilitateCategory.class)
@Categories.ExcludeCategory({getPromovabilitateCategory.class,getConstructorGrupaCategory.class})
public class SuitaCustom {
}
