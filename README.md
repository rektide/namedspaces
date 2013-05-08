namedspaces
===========

Comprised of a number of subprojects related to namespaced entries.

jcc
---
JavaCuratorContent is a simple JCR2 ContentRepository using Netflix's Curator library to provide a single level deep Path & it's data Node's contents

jds
---
JcrDirectoryStream provides a JCR2 EventListener implementation that also serves as a DirectoryStream to list the changes happening. Unlike a normal DirectoryStream, elements will repeat as they are altered.

jr
--
JcrResolver is a MVEL VariableResolverFactory backed by JCR2.

env
---
env is an annotation specifying a mvel expression to ask for when doing a field injection in guice

it relies on a bindListener(EnvProvisionListener(jcr1,jcr2,jcrN)) in the guice module to perform the necessary instrumentation.

yoeo
----
you only exist once is a provider that keeps a cache and can be signalled that it needs to evict it's cached element.


appconf
-------
app name is a discoverable zookeeper endpoint that can be configured via zookeeper as follows:
1. it's app name may be altered and it will move itself
2. a map of jcr repositories to be a virtual directory of

app name synthesizes an enhanced VariableResolverFactory which also emits change events.

