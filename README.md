mozilla-persona
===============

GONG plugin for removing Mozilla Persona plugin!

## Installation

To add the plugin dependencies to your project, edit the project pom.xml and add:

```xml
<project>
  ...
  <dependencies>
    ...
    <dependency>
      <groupId>com.atex.plugins</groupId>
      <artifactId>mozilla-persona</artifactId>
      <version>1.1-final</version>
    </dependency>
    <dependency>
      <groupId>com.atex.plugins</groupId>
      <artifactId>mozilla-persona</artifactId>
      <version>1.1-final</version>
      <classifier>contentdata</classifier>
    </dependency>
    ...
  </dependencies>
  ...
</project>
```

## Remove mozilla-persona

Running `mvn p:run` in your project, the plugin will remove the mozilla-persona plugin from the system.
You'll need to manually clean up you velocity files, get rid of code like this:

```
#render({"outputTemplate": "com.atex.plugins.persona.LoginLogout.ot"})
```

Once you started your project and the import run through, you can then remove the dependency
(i.e. if you had mozilla-persona in production, you must deploy this plugin to production at least once).


## Polopoly Version
10.16

## Code Status
The code in this repository is provided with the following status: **EXAMPLE**

Under the open source initiative, Atex provides source code for plugin with different levels of support. There are three different levels of support used. These are:

- EXAMPLE  
The code is provided as an illustration of a pattern or blueprint for how to use a specific feature. Code provided as is.

- PROJECT  
The code has been identified in an implementation project to be generic enough to be useful also in other projects. This means that it has actually been used in production somewhere, but it comes "as is", with no support attached. The idea is to promote code reuse and to provide a convenient starting point for customization if needed.

- PRODUCT  
The code is provided with full product support, just as the core Polopoly product itself.
If you modify the code (outside of configuraton files), the support is voided.


## License
Atex Polopoly Source Code License
Version 1.0 February 2012

See file **LICENSE** for details
