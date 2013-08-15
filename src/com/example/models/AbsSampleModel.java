package com.example.models;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class AbsSampleModel {

	public static class CheckoutShippingKeys {
		public static final String COUNTRY_NAME = "countryName";
		public static final String FIRST_NAME = "firstName";
		public static final String LAST_NAME = "lastName";
		public static final String ADDRESS = "address1";
		public static final String STATE_NAME = "stateName";
		public static final String CITY = "city";
		public static final String COMPANY_NAME = "companyName";
		public static final String ZIP = "zip";
		public static final String CHECKOUT_SHIPPING_DATA = "checkout shipping data";
		public static final String PHONE = "phone";
		public static final String EMAIL = "email";
		public static final String ADDRESS_NAME = "addressName";
	}

	private String mCountry;
	private String mFirstName;
	private String mLastName;
	private String mAddress;
	private String mCity;
	private String mStateProvince;
	private String mPostalCode;
	private String mToken;
	private String mAddressName;
	private boolean mIsDefaultBilling;
	private boolean mIsDefaultShipping;

	// TODO FIX IMPLEMENTATION AND LOGISTICS OF THIS CLASS

	// public public AbsSampleModel() {
	// // TODO Auto-generated constructor stub
	// }

	public AbsSampleModel(Spinner country, EditText firstName,
			EditText lastName, EditText addressOne, EditText addressTwo,
			EditText city, Spinner stateProvince, EditText postalCode,
			EditText mTelephoneNumber) {
		setmCountry(country.getSelectedItem().toString());
		setmFirstName(firstName.getText().toString());
		setmLastName(lastName.getText().toString());
		setmAddress(addressOne.getText().toString() + " "
				+ addressTwo.getText().toString());
		setmCity(city.getText().toString());
		setmStateProvince(stateProvince.getSelectedItem().toString());
		setmPostalCode(postalCode.getText().toString());
		setmIsDefaultBilling(false);
		setmIsDefaultShipping(false);
	}

	public Bundle getCheckoutShippingBundle() {

		Bundle shippingDetails = new Bundle();
		shippingDetails.putString(CheckoutShippingKeys.COUNTRY_NAME,
				getmCountry());
		shippingDetails.putString(CheckoutShippingKeys.FIRST_NAME,
				getmFirstName());
		shippingDetails.putString(CheckoutShippingKeys.LAST_NAME,
				getmLastName());
		shippingDetails.putString(CheckoutShippingKeys.ADDRESS, getmAddress());
		shippingDetails.putString(CheckoutShippingKeys.CITY, getmCity());
		shippingDetails.putString(CheckoutShippingKeys.STATE_NAME,
				getmStateProvince());
		shippingDetails.putString(CheckoutShippingKeys.ZIP, getmPostalCode());
		shippingDetails.putString(CheckoutShippingKeys.CHECKOUT_SHIPPING_DATA,
				getString());
		shippingDetails.putString("auth_token", getmToken());

		return shippingDetails;
	}

	public String getString() {
		return getmFirstName() + " " + getmLastName() + "\n" + getmAddress()
				+ "\n" + getmCity() + ", " + getmStateProvince() + "\n"
				+ getmPostalCode();
	}

	public void setToken(String token) {

		setmToken(token);
	}

	public String getmCountry() {
		return mCountry;
	}

	public void setmCountry(String mCountry) {
		this.mCountry = mCountry;
	}

	public String getmFirstName() {
		return mFirstName;
	}

	public void setmFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}

	public String getmLastName() {
		return mLastName;
	}

	public void setmLastName(String mLastName) {
		this.mLastName = mLastName;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getmCity() {
		return mCity;
	}

	public void setmCity(String mCity) {
		this.mCity = mCity;
	}

	public String getmStateProvince() {
		return mStateProvince;
	}

	public void setmStateProvince(String mStateProvince) {
		this.mStateProvince = mStateProvince;
	}

	public String getmPostalCode() {
		return mPostalCode;
	}

	public void setmPostalCode(String mPostalCode) {
		this.mPostalCode = mPostalCode;
	}

	public String getmToken() {
		return mToken;
	}

	public void setmToken(String mToken) {
		this.mToken = mToken;
	}

	public String getmAddressName() {
		return mAddressName;
	}

	public void setmAddressName(String mAddressName) {
		this.mAddressName = mAddressName;
	}

	public boolean ismIsDefaultBilling() {
		return mIsDefaultBilling;
	}

	public void setmIsDefaultBilling(boolean mIsDefaultBilling) {
		this.mIsDefaultBilling = mIsDefaultBilling;
	}

	public boolean ismIsDefaultShipping() {
		return mIsDefaultShipping;
	}

	public void setmIsDefaultShipping(boolean mIsDefaultShipping) {
		this.mIsDefaultShipping = mIsDefaultShipping;
	}

}
