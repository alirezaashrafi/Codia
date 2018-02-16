package com.alirezaashrafi.codia

import com.alirezaashrafi.library.Codia

/**
 * Android Created by AlirezaAshrafi on 2/16/2018.
 */

class Kotlin {

    private fun kotlin() {
        val text = "Easy and Fast android - php - java Encryption Decryption library"

        val encodedText = Codia.encode(text)
        val decodedText = Codia.decode(encodedText)
    }
}
