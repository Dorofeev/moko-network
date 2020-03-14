/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.network.exceptionfactory

import dev.icerock.moko.network.exceptions.ResponseException

interface ExceptionFactory {
    fun createException(httpStatusCode: Int, responseBody: String?): ResponseException
}
