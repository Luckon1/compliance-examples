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
package com.saltedge.connector.sdk.models;

import com.saltedge.connector.sdk.models.persistence.Token;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class TokenTests {
	@Test
	public void initConfirmedTokenTest() {
		Token token = new Token();

		assertThat(token.status).isEqualTo(Token.Status.UNCONFIRMED);
		assertThat(token.accessToken).isNull();
		assertThat(token.tokenExpiresAt).isNull();

		token.initConfirmedToken();

		assertThat(token.status).isEqualTo(Token.Status.CONFIRMED);
		assertThat(token.accessToken).isNotEmpty();
		assertThat(token.tokenExpiresAt).isAfter(new Date());
	}

	@Test
	public void regenerateTokenAndExpiresAtTest() {
		Token token = new Token();

		assertThat(token.status).isEqualTo(Token.Status.UNCONFIRMED);
		assertThat(token.accessToken).isNull();
		assertThat(token.tokenExpiresAt).isNull();

		token.regenerateTokenAndExpiresAt();

		assertThat(token.status).isEqualTo(Token.Status.UNCONFIRMED);
		assertThat(token.accessToken).isNotEmpty();
		assertThat(token.tokenExpiresAt).isAfter(new Date());
	}

	@Test
	public void isExpiredTest() {
		Token token = new Token();

		assertThat(token.isExpired()).isTrue();

		token.setTokenExpiresAt(LocalDateTime.now().minusSeconds(1));

		assertThat(token.isExpired()).isTrue();

		token.setTokenExpiresAt(LocalDateTime.now().plusSeconds(1));

		assertThat(token.isExpired()).isFalse();
	}
}
