import tkinter as tk
import webbrowser


# import webbrowser

# Register a new browser name for the simple browser
browser_name = 'simple'
browser_executable = r'C:\Path\To\Browser\Executable.exe'  # Replace with the actual path to your browser executable
webbrowser.register(browser_name, None, webbrowser.BackgroundBrowser(browser_executable))

# Open a URL in the simple browser
url = 'https://www.example.com'
webbrowser.get(browser_name).open(url)




# Default URL to open
default_url = "https://www.google.com"

# def open_browser():
#     url = url_entry.get()
#     webbrowser.open(url)

def open_browser():
    url = url_entry.get()
    browser = webbrowser.get('')  # Use the default browser
    browser.open(url, new=1)


root = tk.Tk()
root.title("Simple Browser")

# URL input field
url_label = tk.Label(root, text="Enter URL:")
url_label.pack(side=tk.LEFT)
url_entry = tk.Entry(root)
url_entry.pack(side=tk.LEFT)
url_entry.insert(0, default_url)  # Set default URL in entry field

# Open button
open_button = tk.Button(root, text="Open", command=open_browser)
open_button.pack(side=tk.LEFT)

# Open default URL on startup
webbrowser.open(default_url)

root.mainloop()
