package annotationPack;

import annotationPack.OwnAnnotationClass.SmartPhones;

public class OwnAnnotationClass 
{
	//empty annotation is called Marker Annotation
	//if 1 value is present is called Single value Annotation
	//if more values are present is called multi value Annotation
	
	public @interface SmartPhones 
	{
		String os() default "abcd";
		int version() default 1;
		

	}

	@SmartPhones(os="Android",version=6)
	class Nokia
	{
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
