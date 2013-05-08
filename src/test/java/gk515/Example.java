class Example{
	@Inject
	@Env("@{aString}")
	final String aString;

	@Inject
	@Env("@{aString}")
	final Provider<String> aStringProvider;

	public Example(){
	}

	public sayHi(){
		System.out.println("Hello from string "+this.aString)
		System.out.println("Hello from strings "+this.aString+", "+this.aStringProvider.get())
	}
}
