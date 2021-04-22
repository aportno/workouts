
## python

def duplicate_count(text):
    return len(set([i for i in text.lower() if text.lower().count(i) >= 2]))
