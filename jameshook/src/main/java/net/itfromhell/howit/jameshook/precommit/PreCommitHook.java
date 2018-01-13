/**
 * Copyright 2018 Gabriel Stelmach
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to 
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * Licensed under the MIT license: https://opensource.org/licenses/MIT
 */
package net.itfromhell.howit.jameshook.precommit;

/**
 * Definition to implement the pre-commit hook.
 *
 * @author Gabriel Stelmach <gabriel_stelmach@hotmail.com>
 */
public interface PreCommitHook
{
  /**
	 * Performs the validation of commit.
   * 
   * @param args Array of parameters to execute the hook.
   * @throws PreCommitException Happens when any or all implemented rules are broken.
   */
  public void validate(String[] args) throws PreCommitException;
}