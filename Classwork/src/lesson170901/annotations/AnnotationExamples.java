package lesson170901.annotations;

import java.lang.annotation.Annotation;

@MyAnno
public class AnnotationExamples {
	@MyAnno
	public static void main(@MyAnno String[] args) {
		
		Class<AnnotationExamples> clazz = AnnotationExamples.class;
		
		@MyAnno
		Annotation[] annotations = clazz.getAnnotations();
		
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
	}

}
