package util;

public interface HttpCallbackListener {
	void onFinish(String request);
	void onError(Exception e); 
}
