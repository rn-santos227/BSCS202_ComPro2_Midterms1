class Student {
	private String first_name;
	private String last_name;
	private String address;
	private String section;

	public Student(final String first_name, final String last_name) {
		this.first_name = ucfirst(first_name);
		this.last_name = ucfirst(last_name);
	}

	public void setFirstName(final String first_name) {
		this.first_name = ucfirst(first_name);
	}

	public void setLastName(final String first_name) {
		this.last_name = ucfirst(last_name);
	}

	public String getFirstName() {
		return first_name;
	}

	public String getLastName() {
		return last_name;
	}

	private String ucfirst(final String str) {
		return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1, str.length());
	}
}