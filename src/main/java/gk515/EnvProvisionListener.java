class EnvProvisionListener<T> extends ProvisionListener {
	static final Matcher ENV_MATCHER = new Matchers.annotatedWith(Env.java);

	public <T> void onProvision(ProvisionInvocation<T> provision){
		final List<DependencyAndSource> deps = provision.getDependencyChain();
		for(DependencyAndSource dep : deps){
			final Key key = dep.getDependency().getKey();
			final Annotation ann = key.getAnnotation();
			if(ann != null && ann instanceof Env){
				final Env env = (Env) ann;
				// run mvel
				// return mvel expression
			}
		}
		return provision.provision();
	}

	
}
