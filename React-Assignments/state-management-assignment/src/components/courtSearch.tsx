import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Paper,
  Container,
  Divider,
  Button,
  Typography,
  styled,
} from "@mui/material";
import React from "react";

function createData(search: string | any, status: any, date: any) {
  return { search, status, date };
}

const MuiButton = styled(Button)({
    color: 'darkblue',
    textTransform: 'capitalize',
});

const MuiTable = styled(Table)({
    minWidth: 250,
});

const MuiTableCell = styled(TableCell)({
    fontWeight: "bold",
});

const MuiTableRow = styled(TableRow)({
    "&:last-child td, &:last-child th": { border: 0 },
});

const CourtSearch = () => {
  const rows = [
    createData(
      <MuiButton>
        SSN Verification
      </MuiButton>,
      <Button color="success">Clear</Button>,
      <Typography variant="body1">2/22/2022</Typography>
    ),
    createData(
      <MuiButton>Sex Offender</MuiButton>,
      <Button color="success">Clear</Button>,
      <Typography variant="body1">3/13/2022</Typography>
    ),
    createData(
      <MuiButton>Global Watchlist</MuiButton>,
      <Button color='success'>Clear</Button>,
      <Typography variant="body1">7/12/2022</Typography>
    ),
    createData(
      <MuiButton>Federal Criminal</MuiButton>,
      <Button color="success">Clear</Button>,
      <Typography variant="body1">2/20/2022</Typography>
    ),
    createData(
      <MuiButton>Country Criminal</MuiButton>,
      <Button color="success">Clear</Button>,
      <Typography variant="body1">5/19/2022</Typography>
    ),
  ];

  return (
    <Paper component={Container}>
      <Typography variant="h6" paddingBottom='1rem'>Court Search</Typography>
      <Divider />
      <TableContainer>
        <MuiTable size="small" aria-label="simple table">
          <TableHead>
            <TableRow>
              <MuiTableCell>SEARCH</MuiTableCell>
              <MuiTableCell>STATUS</MuiTableCell>
              <MuiTableCell>DATE</MuiTableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {rows.map((row) => (
              <MuiTableRow key={row.search} >
                <TableCell component="th" scope="row">{row.search}</TableCell>
                <TableCell>{row.status}</TableCell>
                <TableCell>{row.date}</TableCell>
              </MuiTableRow>
            ))}
          </TableBody>
        </MuiTable>
      </TableContainer>
    </Paper>
  );
};

export default CourtSearch;

