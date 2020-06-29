package edu.cnm.deepdive.quotes.model.pojo;

import androidx.room.Relation;
import edu.cnm.deepdive.quotes.model.entity.Quote;
import edu.cnm.deepdive.quotes.model.entity.Source;
import java.util.List;

public class SourceWithQuotes extends Source {

  @Relation(entity = Quote.class, entityColumn = "source_id", parentColumn = "source_id")
  private List<Quote> quote;

  public List<Quote> getQuote() {
    return quote;
  }

  public void setQuote(List<Quote> quote) {
    this.quote = quote;
  }
}
