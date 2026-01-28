package com.annotations.suppresswarnings;

public class LagacyAPITest {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		LegacyAPI api = new LegacyAPI();
		api.oldFeature(); // warning
		api.newFeature();
	}
}