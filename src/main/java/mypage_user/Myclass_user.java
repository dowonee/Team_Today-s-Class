package mypage_user;

public class Myclass_user {
	private String classcode;
	private String title;
	private String profile;
	private String id;
	private String nickname;
	private String datepicker;
	private String price;
	private String loc;
	
	public String getClasscode() {
		return classcode;
	}
	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDatepicker() {
		return datepicker;
	}
	public void setDatepicker(String datepicker) {
		this.datepicker = datepicker;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Myclass_user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Myclass_user(String classcode, String title, String profile, String id, String nickname, String datepicker,
			String price, String loc) {
		super();
		this.classcode = classcode;
		this.title = title;
		this.profile = profile;
		this.id = id;
		this.nickname = nickname;
		this.datepicker = datepicker;
		this.price = price;
		this.loc = loc;
	}
	
	
	
}
