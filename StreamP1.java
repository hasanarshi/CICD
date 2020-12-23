import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class User 
{
	int id;
	String name;

	public User(int i, String name) {
		this.id = i;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
	public String tooString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}

public class StreamP1 {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(new User(1, "a"));
		Map<Integer, User> map = users.stream().collect(Collectors.toMap((u) -> u.id, (u) -> u));
		System.out.println(map);
	}
}