/*
 * @author Constantin Chelban (constantink@saltedge.com)
 * Copyright (c) 2020 Salt Edge.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.saltedge.connector.sdk.config;

public class Constants {
    public final static String API_BASE_PATH = "/api/priora";
    public final static String CALLBACK_BASE_PATH = "/api/connectors/v1";

    public final static String HEADER_AUTHORIZATION = "authorization";
    public final static String HEADER_CLIENT_ID = "client-id";
    public final static String HEADER_ACCESS_TOKEN = "access-token";

    public final static String KEY_DATA = "data";
    public final static String KEY_EXP = "exp";
    public final static String KEY_ID = "id";
    public final static String KEY_USER_ID = "user_id";
    public final static String KEY_EXTRA = "extra";
    public final static String KEY_FEES = "fees";
    public final static String KEY_ORIGINAL_REQUEST = "original_request";
    public final static String KEY_CLIENT_JWT = "client_jwt";
    public final static String KEY_CLIENT_PAYLOAD = "client_payload";
    public final static String KEY_REDIRECT_URL = "redirect_url";
    public final static String KEY_ERROR_MESSAGE = "error_message";
    public final static String KEY_ERROR_CLASS = "error_class";
    public final static String KEY_SESSION_SECRET = "session_secret";
    public final static String KEY_CREDENTIALS = "credentials";
    public final static String KEY_FORCE_SCA = "force_sca";
    public final static String KEY_CONFIRMATION_CODE = "confirmation_code";
    public final static String KEY_PROVIDER_CODE = "provider_code";
    public final static String KEY_SCOPES = "scopes";
    public final static String KEY_STATUS = "status";
    public final static String KEY_CURRENCY_CODE = "currency_code";
    public final static String KEY_AMOUNT = "amount";
    public final static String KEY_PAYMENT_ID = "payment_id";
    public final static String KEY_PRIORA_PAYMENT_ID = "priora_payment_id";
    public final static String KEY_ACCOUNT_ID = "account_id";
    public final static String KEY_DESCRIPTION = "description";
    public final static String KEY_INTERACTIVE_STEP_INSTRUCTION = "interactive_step_instruction";

    public final static String STATUS_WAITING_CONFIRMATION_CODE = "waiting_confirmation_code";
    public final static String STATUS_REDIRECT = "redirect";
}
