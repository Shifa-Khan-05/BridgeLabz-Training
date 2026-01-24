package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

interface MessageFilter<T> {
	boolean filter(T msg);
}

