package klauer.rubyjarit;

import org.jruby.embed.ScriptingContainer;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ScriptingContainer container = new ScriptingContainer();
        container.getProvider().getRubyInstanceConfig()
                .setJRubyHome(Thread.currentThread()
                .getContextClassLoader()
                .getResource("META-INF/jruby.home")
                .toString()
                .replaceFirst("^jar:", ""));
        System.out.println("jrubyhome: " + container.getHomeDirectory());
        String script = "p require 'rubygems'\np require 'sinatra'\nputs 'hello world'";
        container.runScriptlet(script);
    }
}
