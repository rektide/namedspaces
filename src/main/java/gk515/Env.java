@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD)
@interface Env{
	public String value() default "@{injectionType.getSimpleName()}";
}

