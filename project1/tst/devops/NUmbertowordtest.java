package devops;

import org.hamcrest.core.Is;
import org.junit.*;
import org.junit.jupiter.api.Test;



public class Converttest 
{
	
	@Test
	public void ConverttoWords1() {
		
		Assert.assertThat(Converter.Convert(1), Is.is("One"));
	}
	
	@Test
	public void ConverttoWords2() {
		
		Assert.assertThat(Converter.Convert(2), Is.is("Two"));
	}
	
	}
	
