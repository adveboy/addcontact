package skardash.addcontact;

import android.os.Parcel;
import android.os.Parcelable;

public class Country implements Parcelable {

	String code = null;
	String name = null;
	boolean selected = false;

	public Country(String code, String name, boolean selected) {
		super();
		this.code = code;
		this.name = name;
		this.selected = selected;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		
	}

}