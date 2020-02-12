/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.comparisons

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//


/**
 * Returns the greater of two values.
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a >= b) a else b
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Byte, b: Byte): Byte {
    return maxOf(a.toInt(), b.toInt()).toByte()
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Short, b: Short): Short {
    return maxOf(a.toInt(), b.toInt()).toShort()
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Int, b: Int): Int {
    return if (a >= b) a else b
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Long, b: Long): Long {
    return if (a >= b) a else b
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Float, b: Float): Float {
    return if (a.compareTo(b) >= 0) a else b
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Double, b: Double): Double {
    return if (a.compareTo(b) >= 0) a else b
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> maxOf(a: T, b: T, c: T): T {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Byte, b: Byte, c: Byte): Byte {
    return maxOf(a.toInt(), maxOf(b.toInt(), c.toInt())).toByte()
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Short, b: Short, c: Short): Short {
    return maxOf(a.toInt(), maxOf(b.toInt(), c.toInt())).toShort()
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Int, b: Int, c: Int): Int {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Long, b: Long, c: Long): Long {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Float, b: Float, c: Float): Float {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Double, b: Double, c: Double): Double {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the smaller of two values.
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> minOf(a: T, b: T): T {
    return if (a <= b) a else b
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Byte, b: Byte): Byte {
    return minOf(a.toInt(), b.toInt()).toByte()
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Short, b: Short): Short {
    return minOf(a.toInt(), b.toInt()).toShort()
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Int, b: Int): Int {
    return if (a <= b) a else b
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Long, b: Long): Long {
    return if (a <= b) a else b
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Float, b: Float): Float {
    return when {
        a.isNaN() -> a
        b.isNaN() -> b
        else -> if (a.compareTo(b) <= 0) a else b
    }
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Double, b: Double): Double {
    return when {
        a.isNaN() -> a
        b.isNaN() -> b
        else -> if (a.compareTo(b) <= 0) a else b
    }
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> minOf(a: T, b: T, c: T): T {
    return minOf(a, minOf(b, c))
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Byte, b: Byte, c: Byte): Byte {
    return minOf(a.toInt(), minOf(b.toInt(), c.toInt())).toByte()
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Short, b: Short, c: Short): Short {
    return minOf(a.toInt(), minOf(b.toInt(), c.toInt())).toShort()
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Int, b: Int, c: Int): Int {
    return minOf(a, minOf(b, c))
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Long, b: Long, c: Long): Long {
    return minOf(a, minOf(b, c))
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Float, b: Float, c: Float): Float {
    return minOf(a, minOf(b, c))
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Double, b: Double, c: Double): Double {
    return minOf(a, minOf(b, c))
}

