/* !!! DOOST !!! */

/*
   A Java implementation of BLAKE2B cryptographic digest algorithm.

   Joubin Mohammad Houshyar <alphazero@sensesay.net>
   bushwick, nyc
   02-14-2014

   --

   To the extent possible under law, the author(s) have dedicated all copyright
   and related and neighboring rights to this software to the public domain
   worldwide. This software is distributed without any warranty.

   You should have received a copy of the CC0 Public Domain Dedication along with
   this software. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.
*/

package ove.crypto.digest;

import org.testng.annotations.Test;

@Test
public class TestParam {
	public void testClone() {
		try {
		final Blake2b.Param param = Blake2BTestUtils.newDefaultParam();
		final Blake2b.Param clone = param.clone();

		// TODO deep compare.
		} catch (Throwable e) {
			e.printStackTrace();;
		}
	}
}
