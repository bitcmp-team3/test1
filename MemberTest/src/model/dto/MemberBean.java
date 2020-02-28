package model.dto;

public class MemberBean {
	private String id;
	private String pw;
	private String pwForm;
	private String nickName;
	private String addr;
	private int cartCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public String getPwForm() {
	
		return pwForm;
	}

	public void setPw(String pw) {
		this.pw = pw;
		pwForm = pw.substring(0, 2) + "*****";
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	

	public int getCartCount() {
		return cartCount;
	}

	public void setCartCount(int cartCount) {
		this.cartCount = cartCount;
	}

	public void setPwForm(String pwForm) {
		this.pwForm = pwForm;
	}

	@Override
	public String toString() {
		return "MemeberBean [id=" + id + ", pw=" + pw + ", pwForm=" + pwForm + ", nickName=" + nickName + ", addr="
				+ addr + ", cartCount=" + cartCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + cartCount;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		result = prime * result + ((pwForm == null) ? 0 : pwForm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberBean other = (MemberBean) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (cartCount != other.cartCount)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		if (pwForm == null) {
			if (other.pwForm != null)
				return false;
		} else if (!pwForm.equals(other.pwForm))
			return false;
		return true;
	}
	
	
}