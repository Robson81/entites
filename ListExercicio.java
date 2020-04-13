package _0entities;

public class ListExercicio {

	private Integer id;
	private String name;
	private Integer age;
	private Integer phone;

	public ListExercicio() {

	}

	public ListExercicio(Integer id, String name, Integer age, Integer phone) {

		this.id = id;
		this.name = name;
		this.age =2020 - age;
		this.phone = phone;
	}

	public void birthDate(int year) {

		age = 2020 - year;

	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String toString() {

		return "Id: " + id + ", Name: " + name + ", Age: " + age + ", Phone number: " + phone;
	}

}
