package Runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",glue = "Steps", tags = "@FormularioAberturaDeConta",plugin =
{"pretty","html:RelatorioExecucao/RelatorioNubank.html"}, monochrome = false )
public class Runner {
	

}
