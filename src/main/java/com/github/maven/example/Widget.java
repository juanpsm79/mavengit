package com.github.maven.example;

/**
 * Simple wigdet class that can be enabled or disabled
 */
public class Widget {

	public boolean isCocoa() {
		return cocoa;
	}

	public void setCocoa(boolean cocoa) {
		this.cocoa = cocoa;
	}

	private boolean enabled;
	private boolean cocoa;

	private boolean funcional;

    private boolean pep;


	/**
	 * Create new enabled widget
	 */
	public Widget() {
		enabled = true;
	}

	/**
	 * Is the widget currently enabled?
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Set the widget enable state
	 * 
	 * @param enabled
	 * @return this widget
	 */
	public Widget setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}


	public boolean isFuncional() {
		return funcional;
	}

	public void setFuncional(boolean funcional) {
		this.funcional = funcional;
	}


	public boolean isPep() {
		return pep;
	}

	public void setPep(boolean pep) {
		this.pep = pep;
	}
}

